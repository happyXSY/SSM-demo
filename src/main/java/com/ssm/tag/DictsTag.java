package com.ssm.tag;

import java.io.IOException;
import java.util.List;
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

public class DictsTag implements TemplateDirectiveModel {

	@Autowired
	private DictService dictService;

	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body)
			throws TemplateException, IOException {
		String pcode = params.get("parentCode").toString();
		if (StringUtils.isNotBlank(pcode)) {
			List<Dict> dicts = dictService.findDicts(pcode);
			env.setVariable("dictlist", ObjectWrapper.DEFAULT_WRAPPER.wrap(dicts));
			body.render(env.getOut());
		}
	}

}
