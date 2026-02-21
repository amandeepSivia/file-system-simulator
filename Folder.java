
import java.util.ArrayList;

public class Folder extends FileComponent {
    private ArrayList<FileComponent> contents;

    public Folder(String n){
        name = n;
        contents = new ArrayList<>();
    }
    
    public void addFileComponent(FileComponent fc){
        contents.add(fc);
        fc.setParent(this);
    }
    
    public void display(String indent) {
        indent += "--";
        System.out.println(indent + "Folder: "+name);
        for(FileComponent fileComponent: contents){
            fileComponent.display(indent);
        }
    }

    public String toString(){
        return name;
    }
    public int getSize(){
        int size = 0;
        for(int i = 0; i < contents.size(); i++){
            size+=contents.get(i).getSize();
        }
        return size;
    }
    public int getItemCount(){
        int count = 0;
        for(int i = 0; i < contents.size(); i++){
            count+=contents.get(i).getItemCount();
        }
        return count;
    }

    public ArrayList<FileComponent> getFolderComponents(){
        return contents;
    }

    public void accept(Visitor v) {
           v.visit(this);
    }

}
