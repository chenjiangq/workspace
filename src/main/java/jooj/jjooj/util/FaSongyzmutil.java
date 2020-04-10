package jooj.jjooj.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;


public class FaSongyzmutil {
    public static boolean fasong(String  phoneNumber,String yzm,int flag) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4Fqmuh6F9maVJbeQksUh", "Q2OpTfu5W3qND9pE2ELFrLTHd5nzCc");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phoneNumber);
        request.putQueryParameter("SignName", "虎头帽a");
        request.putQueryParameter("TemplateCode", "sys-567");
        request.putQueryParameter("TemplateParam", "{\"code\":\""+yzm+"\"}");
        if(flag==1){
            request.putQueryParameter("TemplateCode", "SMS_187561124");
        }else {
            request.putQueryParameter("TemplateCode", "SMS_187541042");
        }
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();

        }
        return false;
    }


}
