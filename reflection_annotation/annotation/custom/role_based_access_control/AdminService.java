package reflection_annotation.annotation.custom.role_based_access_control;

public class AdminService {
    @RoleAllowed("ADMIN")
    public void performAdminTask(){
        System.out.println("Admin task performed successfully");
    }

    public void performGeneralTask(){
        System.out.println("General task performed");
    }
}
