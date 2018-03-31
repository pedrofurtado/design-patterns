public class DiskFile extends File {
    public DiskFile(String name) {
        this.name = name;
        this.loadFromDisk();
    }
    
    public void display() {
        System.out.format("Rendering of file '%s' on screen...\n", this.name);
        System.out.format("'%s' rendered.\n", this.name);
    }
    
    private void loadFromDisk() {
        System.out.format("Loading from disk the file '%s' ...\n", this.name);
        System.out.format("'%s' loaded from disk.\n", this.name);
    }
}
