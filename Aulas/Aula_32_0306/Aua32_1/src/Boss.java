public class Boss {

    private static Boss boss;

    Boss(){}

    public static Boss criarBoss(){
        if (boss == null){
            return new Boss();
        }
        return boss;
    }
}
