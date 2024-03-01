public interface UserRole {
    void assignPermissions();
}

public class AdminRole implements UserRole {
    @Override
    public void assignPermissions() {
        System.out.println("Admin permissions assigned.");
    }
}

public class EditorRole implements UserRole {
    @Override
    public void assignPermissions() {
        System.out.println("Editor permissions assigned.");
    }
}

public class UserRoleFactory {
    public UserRole getUserRole(String roleType) {
        if (roleType == null) {
            return null;
        }
        if (roleType.equalsIgnoreCase("ADMIN")) {
            return new AdminRole();
        } else if (roleType.equalsIgnoreCase("EDITOR")) {
            return new EditorRole();
        }
        return null;
    }
}
