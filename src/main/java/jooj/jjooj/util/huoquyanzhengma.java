package jooj.jjooj.util;

public class huoquyanzhengma {

    public static String getYzm(){
        String yzm="";
        for(int i=1;i<=6;i++){
            yzm+=(int)Math.floor(Math.random()*10);
        }
        return yzm;
    }
}
