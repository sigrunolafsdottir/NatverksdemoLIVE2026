package SecondDayDemo.ExceptionDemo;

public class UnluckyNumberException extends Exception{

    protected String myMessage;

    public void setMyMessage(String m){
        myMessage = m;
    }

    public String getMyMessage(){
        return myMessage;
    }

    public UnluckyNumberException(String s) {
        myMessage = s;
    }
}
