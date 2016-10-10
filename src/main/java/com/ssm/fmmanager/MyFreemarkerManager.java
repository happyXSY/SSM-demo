package com.ssm.fmmanager;

import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.views.freemarker.FreemarkerManager;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ssm.tag.ShiroTags;

import freemarker.template.Configuration;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;

public class MyFreemarkerManager extends FreemarkerManager {

	@Override
	protected Configuration createConfiguration(ServletContext servletContext) throws TemplateException {
		Configuration cfg = super.createConfiguration(servletContext);
		ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
		Map<String, TemplateDirectiveModel> beans = ctx.getBeansOfType(TemplateDirectiveModel.class);
		for (String key : beans.keySet()) {
			Object bean = beans.get(key);
			if (bean != null && bean instanceof TemplateDirectiveModel)
				cfg.setSharedVariable(key, bean);
		}
		cfg.setSharedVariable("shiro", new ShiroTags());
		return cfg;
	}
}
