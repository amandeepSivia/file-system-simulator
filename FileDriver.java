
public class FileDriver{
    public static void main(String[] args){
        FileComponent courses = new Folder("Courses");
        FileComponent acs3913 = new Folder("ACS-3913 Software Des & Arch");
        FileComponent acs3916 = new Folder("ACS-3916 HCI");
        courses.addFileComponent(acs3913);
        courses.addFileComponent(acs3916);

        acs3913.addFileComponent(new File("Assignment1.txt",
                "Design patterns: Strategy, Observer; Diagrams, class, object, sequence; ducks, game, pickups", 
                254));
        acs3913.addFileComponent(new File("Assignment2.txt",
                "Design patterns: Law of Demeter, State, Decorator, Adapter;  Diagrams: class, state, object, sequence;  paperboy, gumbball, game, ham, weapon, enhancements", 
                675));   
        acs3913.addFileComponent(new File("Assignment3.txt",
                "Design patterns: Command, Template Method, Singleton, Factory Method, Abstract Factory;  Diagrams: class, sequence, object; remote, undo/redo, configuration, logger, Mario, enemies", 
                1254));         
        acs3913.addFileComponent(new File("Assignment4.txt",
                "Design patterns: Composite, Visitor;  Diagrams: class, object, sequence;  file, backup, search", 
                430));   
                
        acs3916.addFileComponent(new File("Assignment1.txt",
                "Good/bad design, design principles, usability goals, prototyping tools", 
                453));
        acs3916.addFileComponent(new File("Assignment2.txt",
                "More prototyping, interviews, design, mental model", 
                645));

        FileComponent project = new Folder("Project");
        acs3916.addFileComponent(project);
        
        project.addFileComponent(new File("Proposal.txt",
                "Project proposal, participants, scope, ethics protocol", 
                10));
        project.addFileComponent(new File("MilestoneI.txt",
                "Research methods, interviews, questionnaires, quantitative qualitative analysis, scenarios, personas", 
                1576));
        project.addFileComponent(new File("MilestoneII.txt",
                "Brainstorming, sketching, paper prototype, heuristic evaluation, cognitive walkthrough, medium-fi digital prototype", 
                1487));

        FileComponent projectFinal = new Folder("ProjectFinal"); 
        project.addFileComponent(projectFinal);
        
        projectFinal.addFileComponent(new File("FinalReport.txt", 
                "Vertical prototype, usability testing, medium-high fidelity prototype, reflection", 
                1265));
        projectFinal.addFileComponent(new File("Presentation.txt", 
                "Group presentation slide deck", 
                154));                

        courses.display(" ");
    }
}
