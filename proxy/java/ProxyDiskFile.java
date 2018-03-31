public class ProxyDiskFile extends File {
    private DiskFile file;
    
    public ProxyDiskFile(String name) {
        this.name = name;
    }
    
    public void display() {
        if(this.isAuthorized()) {
            if(this.file == null) {
                this.file = new DiskFile(this.name);
                
                if(this.mustBeCompressed()) {
                    System.out.format("'%s' compressed.\n", this.name);
                }
            }
            
            this.file.display();
        }
        else {
            System.out.println("'%s' not authorized to display.");
        }
    }
    
    private boolean isAuthorized() {
        return this.name != "secret-image.jpg";
    }
    
    private boolean mustBeCompressed() {
        return this.name == "very-large-video.mp3";
    }
}
