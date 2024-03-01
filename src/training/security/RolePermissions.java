package com.example.training.security;

import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public enum Permission {
    CREATE_ORDER, VIEW_ORDER, EDIT_ORDER, DELETE_ORDER;
}

public classRolePermissions {
    public static Map<Role, Set<Permission>> rolePermissionsMap = Map.of(
            Role.ADMIN, EnumSet.allOf(Permission.class),
            Role.MANAGER, EnumSet.of(Permission.CREATE_ORDER, Permission.VIEW_ORDER),
            Role.EDITOR, EnumSet.of(Permission.VIEW_ORDER),
            Role.USER, EnumSet.noneOf(Permission.class)
    );
}
