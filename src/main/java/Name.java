public class Name {

    private final String name;

    public Name(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 다섯글자 이하로 설정 가능합니다");
        }
        if(name.isEmpty()){
            throw new IllegalArgumentException("이름이 없이 Car를 생성할 수 없습니다.");
        }
        this.name = name;
    }
}
