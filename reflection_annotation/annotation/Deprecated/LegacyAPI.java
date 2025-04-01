package reflection_annotation.annotation.Deprecated;

public class LegacyAPI {

    @Deprecated(since = "1.8", forRemoval = true)
    public void oldFeature(){
        System.out.println("this is old feature class");
    }

    public void newFeature(){
        System.out.println("this is new feature class");
    }
}