import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.*;

/*
public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        System.out.println(" Initialy set date: " + sdf.format(cal.getTime()));
        cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
        System.out.println(" Date with month changed : " + sdf.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_MONTH,30);
        System.out.println(" Date with day changed : " + sdf.format(cal.getTime()));

    }
}

 */
/*
public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        System.out.println(" Initialy set date: " + sdf.format(cal.getTime()));
        cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH,30);
        System.out.println(" Date with day and month changed : " + sdf.format(cal.getTime()));
    }
}

 */
/*
public class Test {

    public Test() {
    }
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        cal.set(Calendar.HOUR_OF_DAY,19);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,00);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
        cal.add(Calendar.SECOND,75);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
        cal.add(Calendar.MONTH,1);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
    }
}

 */
/*
public class Test {

    public Test() {
    }
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2002);
        cal.set(Calendar.MONTH,Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH,31);
        cal.set(Calendar.HOUR_OF_DAY,19);
        cal.set(Calendar.MINUTE,30);
        cal.set(Calendar.SECOND,00);
        System.out.println("Current date: " + sdf.format(cal.getTime()));
        cal.roll(Calendar.SECOND,75);
        System.out.println("Rule 1: " + sdf.format(cal.getTime()));
        cal.roll(Calendar.MONTH,1);
        System.out.println("Rule 2: " + sdf.format(cal.getTime()));
    }
}

 */
/*
public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        TimeZone tz = TimeZone.getDefault();
        int rawOffset = tz.getRawOffset();
        System.out.println("Current TimeZone" + tz.getDisplayName() + tz.getID() + "\n\n");
        // Display all available TimeZones
        System.out.println("All Available TimeZones \n");
        String[] idArr = tz.getAvailableIDs();
        for(int cnt=0;cnt < idArr.length;cnt++){
            tz = TimeZone.getTimeZone(idArr[cnt]);
            System.out.println(test.padr(tz.getDisplayName() +
                    tz.getID(),64) + " raw offset=" + tz.getRawOffset() +
                    ";hour offset=(" + tz.getRawOffset()/ (1000 * 60 * 60 ) + ")");
        }
        // Display all available TimeZones same as for Moscow
        System.out.println("\n\n TimeZones same as for Moscow \n");
        idArr = tz.getAvailableIDs(rawOffset);
        for(int cnt=0;cnt < idArr.length;cnt++){
            tz = TimeZone.getTimeZone(idArr[cnt]);
            System.out.println(test.padr(tz.getDisplayName()+
                    tz.getID(),64) + " raw offset=" + tz.getRawOffset() +
                    ";hour offset=(" + tz.getRawOffset()/ (1000 * 60 * 60 ) + ")");
        }
    }
    String padr(String str,int len){
        if(len - str.length() > 0){
            char[] buf = new char[len - str.length()];
            Arrays.fill(buf,' ');
            return str + new String(buf);
        }else{
            return str.substring(0,len);
        }
    }
}

 */
/*
public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        SimpleTimeZone stz = new SimpleTimeZone(
                TimeZone.getDefault().getRawOffset()
                ,TimeZone.getDefault().getID()
                ,Calendar.MARCH
                ,-1
                ,Calendar.SUNDAY
                ,test.getTime(2,0,0,0)
                ,Calendar.OCTOBER
                ,-1
                ,Calendar.SUNDAY
                ,test.getTime(3,0,0,0)
        );
        System.out.println(stz.toString());
    }
    int getTime(int hour,int min,int sec,int ms){
        return hour * 3600000 + min * 60000 + sec * 1000 + ms;
    }
}

 */
/*
//List l = Collections.synchronizedList(new ArrayList(...));
public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        Test t = new Test();
        ArrayList al = new ArrayList();
        al.add("First element");
        al.add("Second element");
        al.add("Third element");
        Iterator it = al.iterator();
        while(it.hasNext()) {
            System.out.println((String)it.next());
        }
        System.out.println("\n");
        al.add(2,"Insertion");
        it = al.iterator();
        while(it.hasNext()){
            System.out.println((String)it.next());
        }
    }
}

 */
/*
public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        LinkedList ll = new LinkedList();
        ll.add("Element1");
        ll.addFirst("Element2");
        ll.addFirst("Element3");
        ll.addLast("Element4");
        test.dumpList(ll);
        ll.remove(2);
        test.dumpList(ll);
        String element = (String)ll.getLast();
        ll.remove(element);
        test.dumpList(ll);
    }
    private void dumpList(List list){
        Iterator it = list.iterator();
        System.out.println();
        while(it.hasNext()){
            System.out.println((String)it.next());
        }
    }
}

 */
/*
public class Test {
    private class TestObject{
        String text = "";
        public TestObject(String text){
            this.text = text;
        };
        public String getText(){
            return this.text;
        }
        public void setText(String text){
            this.text = text;
        }
    }
    public Test() {
    }
    public static void main(String[] args) {
        Test t = new Test();
        TestObject to = null;
        HashMap hm = new HashMap();
        hm.put("Key1",t.new TestObject("Value 1"));
        hm.put("Key2",t.new TestObject("Value 2"));
        hm.put("Key3",t.new TestObject("Value 3"));
        to = (TestObject)hm.get("Key1");
        System.out.println("Object value for Key1 = " + to.getText() + "\n");
        System.out.println("Iteration over entrySet");
        Map.Entry entry = null;
        Iterator it = hm.entrySet().iterator();
        // Итератор для перебора всех точек входа в Map
        while(it.hasNext()){
            entry = (Map.Entry)it.next();
            System.out.println("For key = " + entry.getKey() +
                    " value = " + ((TestObject)entry.getValue()).getText());
        }
        System.out.println();
        System.out.println("Iteration over keySet");
        String key = "";
        // Итератор для перебора всех ключей в Map
        it = hm.keySet().iterator();
        while(it.hasNext()){
            key = (String)it.next();
            System.out.println( "For key = " + key + " value = " +
                    ((TestObject)hm.get(key)).getText());
        }
    }
}

 */
/*
public class Test {
    private class TestObject {
        private String name = "";
        public TestObject(String name) {
            this.name = name;
        }
    }
    private class MyComparator implements Comparator {
        public int compare(Object l,Object r) {
            String left = (String)l;
            String right = (String)r;
            return -1 * left.compareTo(right);
        }
    }
    public Test() {
    }

    public static void main(String[] args) {
        Test test = new Test();
        Vector v = new Vector();
        v.add("bbbbb");
        v.add("aaaaa");
        v.add("ccccc");
        System.out.println("Default elements order");
        test.dumpList(v);
        Collections.sort(v);
        System.out.println("Default sorting order");
        test.dumpList(v);
        System.out.println("Reverse sorting order with providing imlicit comparator");
        Collections.sort(v,test.new MyComparator());
        test.dumpList(v);
    }
    private void dumpList(List l) {
        Iterator it = l.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

 */
/*
public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        Properties props = new Properties();
        StringWriter sw = new StringWriter();
        sw.write("Key1 = Value1 \n");
        sw.write(" Key2 : Value2 \r\n");
        sw.write(" Key3 Value3 \n ");
        InputStream is = new ByteArrayInputStream(sw.toString().getBytes());

        try {
            props.load(is);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        props.list(System.out);
        props.setProperty("Key1","Modified Value1");
        props.setProperty("Key4","Added Value4");
        props.list(System.out);
    }
}

 */
/*
public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        String[] arr = {"String 1","String 4",
                "String 2","String 3"};
        test.dumpArray(arr);
        Arrays.sort(arr);
        test.dumpArray(arr);
        int ind = Arrays.binarySearch(arr,
                "String 4");
        System.out.println(
                "\nIndex of \"String 4\" = " + ind);
    }
    void dumpArray(String arr[]){
        System.out.println();
        for(int cnt=0;cnt < arr.length;cnt++) {
            System.out.println(arr[cnt]);
        }
    }
}

 */
/*
public class Test {

    public Test() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        String toParse =
                "word1;word2;word3;word4";
        StringTokenizer st =
                new StringTokenizer(toParse,";");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}

 */
/*
public class Test {

    public Test() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        System.out.println("Length = " +
                bs1.length()+" size = "+bs1.size());
        System.out.println(bs1);
        bs2.set(1);
        bs2.set(2);
        bs1.and(bs2);
        System.out.println(bs1);
    }
}

 */
/*
public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        Random r = new Random(100);
        // Generating the same sequence numbers
        for(int cnt=0;cnt<9;cnt++){
            System.out.print(r.nextInt() + " ");
        }
        System.out.println();
        r = new Random(100);
        for(int cnt=0;cnt<9;cnt++) {
            System.out.print(r.nextInt() + " ");
        }
        System.out.println();
        // Generating sequence of bytes
        byte[] randArray = new byte[8];
        r.nextBytes(randArray);
        test.dumpArray(randArray);
    }
    void dumpArray(byte[] arr) {
        for(int cnt=0;cnt< arr.length;cnt++) {
            System.out.print(arr[cnt]);
        }
        System.out.println();
    }
}

 */

public class Test {
    public Test() {
    }
    public static void main(String[] args) {
        Test test = new Test();
        Locale l = Locale.getDefault();
        System.out.println(l.getCountry() + " " +
                l.getDisplayCountry() + " " + l.getISO3Country());
        System.out.println(l.getLanguage() + " " +
                l.getDisplayLanguage() + " " + l.getISO3Language());
        System.out.println(l.getVariant() + " " + l.getDisplayVariant());
        l = new Locale("ru","RU","WINDOWS");
        System.out.println(l.getCountry() + " " +
                l.getDisplayCountry() + " " + l.getISO3Country());
        System.out.println(l.getLanguage() + " " +
                l.getDisplayLanguage() + " " + l.getISO3Language());
        System.out.println(l.getVariant() + " " + l.getDisplayVariant());
    }
}


