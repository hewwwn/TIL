//오버라이딩(Overriding) 예제
class ovr1{
    public static void main(String[] args){
        ovr1 a1 = new ovr1(); //부모 클래스 타입의 참조변수 a1에 부모 클래스 ovr1 객체를 생성하여 대입
        ovr2 a2 = new ovr2(); //자식 클래스 타입의 참조변수 a2에 자식 클래스 ovr2 객체를 생성하여 대입
        System.out.print(a1.san(3,2)+a2.san(3,2)); //부모 클래스의 san() 메서드가 호출됨
        // a2.san(3,2) 호출 시 자식 클래스의 san() 메서드가 호출됨
    }
    int san(int x, int y){
        return x+y;
    }
}
class ovr2 extends ovr1{
    int san(int x, int y){
        return x-y+super.san(x,y);
    }
}