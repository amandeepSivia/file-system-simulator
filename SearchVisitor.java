
public class SearchVisitor implements Visitor{
    private String search;
    private int noFiles = 0;
    public void setItem(String search){
        this.search = search;
    }
    public void visit(Folder f){
        for(FileComponent component: f.getFolderComponents()){
            component.accept(this);
        }
    }
    public void visit(File f){
        if(f.getName().contains(search) || f.getData().contains(search)){
            System.out.println(f.getPath());
            noFiles++;
        }
    }
    public String toString(){
        return"Total matches: "+ noFiles + " (s)";
    }
}
