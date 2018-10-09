package data_objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "root")
public class RootData {

    private List<LoginData> loginDataList;

    @XmlElement(name = "login_data")
    public List<LoginData> getLoginDataList() {
        return loginDataList;
    }

    public void setLoginDataList(List<LoginData> loginDataList) {
        this.loginDataList = loginDataList;
    }
}
