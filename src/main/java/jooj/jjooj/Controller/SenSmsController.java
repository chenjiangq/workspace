package jooj.jjooj.Controller;

import jooj.jjooj.util.FaSongyzmutil;
import jooj.jjooj.util.huoquyanzhengma;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenSmsController {

    @RequestMapping("/sendSms")
    public String senSms(String phoneNumber,int flag){
     String yzm= huoquyanzhengma.getYzm();
     boolean res=FaSongyzmutil.fasong(phoneNumber,yzm,flag);
        if(res==true){
            return yzm;
        }else {
            return "";
        }

    }
}
