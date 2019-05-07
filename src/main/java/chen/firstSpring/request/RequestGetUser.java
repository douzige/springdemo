package chen.firstSpring.request;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;


import java.util.Date;

public  class RequestGetUser  {
//    @Null
    @Max(value = 10,message = "id不能大于10或者不能小于1")
    @Min(1)
    private Integer  id;

    private Date  date;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
