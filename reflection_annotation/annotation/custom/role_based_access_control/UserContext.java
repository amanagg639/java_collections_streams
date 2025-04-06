package reflection_annotation.annotation.custom.role_based_access_control;

public class UserContext {
    private static String currentUserRole;

    public static String getCurrentUserRole() {
        return currentUserRole;
    }

    public static void setCurrentUserRole(String currentUserRole) {
        UserContext.currentUserRole = currentUserRole;
    }
}
