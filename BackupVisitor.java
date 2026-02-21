
public class BackupVisitor implements Visitor {
    private int totalSize = 0;
    private int noFiles = 0;
    public void visit(Folder f){
        System.out.println("Backing up folder " + f.getName() + " contents:");
        for(FileComponent component: f.getFolderComponents()){
            component.accept(this);
        }
    }
    public void visit(File f){
        System.out.println("Backing up file " + f.getName() + "...");
        noFiles++;
        totalSize+=f.getSize();
    }

    public String toString(){
        return "Backup complete. Total files: "+ noFiles + ", total size: " + totalSize;
    }
}
