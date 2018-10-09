package data_objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "root")
public class RootData {

    private List<LoginData> loginDataList;
    private List<RezervationData> rezervationDataList;

    @XmlElement(name = "login_data")
    public List<LoginData> getLoginDataList() {
        return loginDataList;
    }

    @XmlElement(name = "reservation_data")
    public List<RezervationData> getRezervationDataList() {
        return rezervationDataList;
    }

    public void setLoginDataList(List<LoginData> loginDataList) {
        this.loginDataList = loginDataList;
    }

    public void setRezervationDataList(List<RezervationData> rezervationDataList) {
        this.rezervationDataList = rezervationDataList;
    }
}
