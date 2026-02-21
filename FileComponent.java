
public abstract class FileComponent {
    protected String name;
    protected FileComponent parent;
    
    public String getName(){
        return name;
    }

    public FileComponent getParent(){
        return parent;
    }
    
    public void setParent(FileComponent fc){
        parent = fc;
    }
    
    public void addFileComponent(FileComponent fc){
        throw new UnsupportedOperationException();
    }

    public void display(String indent){
        throw new UnsupportedOperationException();
    }

    public int getSize(){
        throw new UnsupportedOperationException();
    }

    public int getItemCount(){
        throw new UnsupportedOperationException();
    }

    public String getPath(){
        //throw new UnsupportedOperationException();
        String path= "";
        FileComponent curr=this;
        while(curr.getParent()!=null){
            path = curr.getName()+"/"+path ;
            curr=curr.getParent();
        }
        return path;
    }
    
    public abstract void accept(Visitor v);
}
