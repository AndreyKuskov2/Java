package fa.ru.exam.task24;

public class SmartForm extends Form {
    private String savedPassword;

    @Override
    public void input() {
        super.input();
        savedPassword = getPassword();
    }

    public String getSavedPassword() {
        return savedPassword;
    }
}
