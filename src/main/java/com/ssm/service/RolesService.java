package com.ssm.service;

import java.util.Set;

public interface RolesService {

	Set<String> getRoleById(Integer... rolesId);
}
