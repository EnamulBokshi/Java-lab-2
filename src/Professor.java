public class Professor extends Person implements Classroom{
    public String title;
    Professor(String fname, String lname){
        super(fname, lname);
    }
    void setTitle(String title){
        this.title = title;
    }
    void getTitle(){
        System.out.println(title+" " + fname+" "+ lname);
    }
    @Override
    public void teaching() {
        System.out.println("Professor is teaching");
    }
    @Override
    public void reading() {
        System.out.println("Professor is Reading");
    }
}
