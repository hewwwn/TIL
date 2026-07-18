//오버라이딩 관계를 이용한 다형성 예제
class Perent{
    public int compute(int num){ //오버라이딩 관계
        if(num<=1) return num;
        return compute(num-1)+compute(num-2);
    }
}
class Child extends Perent{
    public int compute(int num){ //이 메서드는 부모 클래스의 compute() 메서드를 오버라이딩함
        if(num<=1) return num; //num 이 4이면 4>1이므로 else문으로 넘어감
        return compute(num-1)+compute(num-3); //즉 compute(3)+compute(1) 호출됨
        //compute(3) 호출 시 다시 compute(2)+compute(0) 호출됨
        //compute(2) 호출 시 다시 compute(1)+compute(-1) 호출됨
        //compute(1) 호출 시 1<=1이므로 1 반환됨
    }
}
class Soojebi{
    public static void main(String[] args){ //main 부터 실행
        Perent obj = new Child(); //부모 클래스 타입의 참조변수 obj에 자식 클래스 Child 객체를 생성하여 대입
        System.out.println(obj.compute(4)); //부모 클래스의 compute() 메서드가 호출됨
    }
}