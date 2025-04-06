package reflection_annotation.annotation.custom.role_based_access_control;

import java.lang.reflect.Method;

public class AccessController {
    public static void invokeMethod(Object obj, String methodName){
        try {
            Method method = obj.getClass().getDeclaredMethod(methodName);
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            if(roleAllowed != null){
                String requiredRole = roleAllowed.value();
                String currentRole = UserContext.getCurrentUserRole();
                if(!requiredRole.equals(currentRole)){
                    System.out.println("Access Denied");
                    return;
                }
            }
            method.invoke(obj);
        }catch (NoSuchMethodException e){
            System.out.println("Method not found");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
