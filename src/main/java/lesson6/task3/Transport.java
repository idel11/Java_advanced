package lesson6.task3;

@MyAnnotation
public class Transport {

    void canMove(){
        System.out.println("Move on any number of wheels");
    }

    @Deprecated
    void useSteamForMove(){
        System.out.println("back to 1930's");
    }

}
