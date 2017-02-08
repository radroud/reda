import javax.faces.bean.ManagedBean;

/**
 * Created by Reda on 08.02.2017.
 */
@ManagedBean
public class HelloBean {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
