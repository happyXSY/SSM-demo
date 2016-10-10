package com.ssm.tag;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.domain.Dict;
import com.ssm.service.DictService;

import freemarker.core.Environment;
import freemarker.template.ObjectWrapper;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

public class DictTag implements TemplateDirectiveModel {
	@Autowired
	private DictService dictService;

	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body)
			throws TemplateException, IOException {
		Object paramvalue = params.get("parentCode");
		Object paramvalue2 = params.get("code");
		if (paramvalue != null || StringUtils.isNotBlank(paramvalue.toString()) && paramvalue2 != null
				|| StringUtils.isNotBlank(paramvalue2.toString())) {
			Dict dict = dictService.selectBydict(paramvalue.toString(), paramvalue2.toString());
			env.setVariable("dictName", ObjectWrapper.DEFAULT_WRAPPER.wrap(dict.getName()));
			body.render(env.getOut());
		}
	}
}
