package ProblemOne;

import java.util.Arrays;

public class MainOne {
    private final int INITIAL_LENGTH = 4;
    private Person[] personArr;
    private int size;

   public MainOne(){
        personArr = new Person[INITIAL_LENGTH];
        size = 0;
    }

    public void add(Person p){
       if(p == null) return;
       if(size == personArr.length) resize();
       personArr[size++] = p;

    }
    public Person get(int i) {
        if (i < 0 || i >= size) {
            return null;
        }
        return personArr[i];
    }
    private void resize() {
        System.out.println("resizing");
        int len = personArr.length;
        int newlen = 2 * len;
        Person[] newArray = new Person[newlen];
        System.arraycopy(personArr, 0, newArray, 0, len);
        personArr = newArray;
    }

    public boolean find(Person p) {
        if (p == null) return false;
        for (Person test : personArr) {
            if (test.equals(p)) return true;
        }
        return false;
    }

    public void insert(Person s, int pos) {
        if (pos > size || pos < 0) return;
        if (pos == personArr.length || size + 1 > personArr.length) {
            resize();
        }
        Person[] temp = new Person[personArr.length + 1];
        System.arraycopy(personArr, 0, temp, 0, pos);
        temp[pos] = s;
        System.arraycopy(personArr, pos, temp, pos + 1, personArr.length - pos);
        personArr = temp;
        ++size;
    }

    public boolean remove(Person p) {
        if (size == 0) return false;
        if (p == null) return false;
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (personArr[i].equals(p)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        Person[] temp = new Person[personArr.length];
        System.arraycopy(personArr, 0, temp, 0, index);
        System.arraycopy(personArr, index + 1, temp, index, personArr.length - (index + 1));
        personArr = temp;
        --size;
        return true;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(personArr[i] + ", ");

        }
        sb.append(personArr[size - 1] + "]");
        return sb.toString();

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }
    public Object clone() {
        Person[] temp = Arrays.copyOf(personArr, size);
        return temp;
    }
    public static void main(String[]args){
       Person p1 = new Person("Hnin","Hsu Hlaing",25);
       Person p2 = new Person("Subedi","Prakash",27);
       Person p3 = new Person("Elizabeth","Elizabeth",30);
       Person p4 = new Person("Soe Moe Aung","Khun",29);
       Person p5 = new Person("Person","New",33);

       MainOne main = new MainOne();
       main.add(p1);
       main.add(p2);
       main.add(p3);
       main.add(p4);
       main.insert(p5,1);


       System.out.println(main.find(p2));

    }

}
