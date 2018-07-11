package com.vesus.springbootoauth2.service;


import com.vesus.springbootoauth2.model.Permission;

import java.util.List;

public interface PermissionService {
    public List<Permission> findAll();
    public List<Permission> findByAdminUserId(int userId);
}
