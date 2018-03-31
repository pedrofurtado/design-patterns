public class Client {
    public static void main(String[] args) {
        File sampleImage = new ProxyDiskFile("sample-image.jpg");
        File secretImage = new ProxyDiskFile("secret-image.jpg");
        File sampleVideo = new ProxyDiskFile("sample-video.mp3");
        File veryLargeVideo = new ProxyDiskFile("very-large-video.mp3");
        File zipFile = new ProxyDiskFile("many-things-together.zip");
        
        System.out.println("==============");
        
        sampleImage.display();
        
        System.out.println("==============");
        
        secretImage.display();

        System.out.println("==============");
        
        sampleVideo.display();
        
        System.out.println("==============");
        
        veryLargeVideo.display();
        
        System.out.println("==============");
        
        zipFile.display();
        
        System.out.println("==============");
        
        System.out.println("\n\nRepeating the previous operations.\n\n");
        
        System.out.println("==============");
        
        sampleImage.display();
        
        System.out.println("==============");
        
        secretImage.display();

        System.out.println("==============");
        
        sampleVideo.display();
        
        System.out.println("==============");
        
        veryLargeVideo.display();
        
        System.out.println("==============");
        
        zipFile.display();
        
        System.out.println("==============");
    }
}
