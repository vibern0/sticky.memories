import java.net.URL;
/**
 *
 * @author andre
 */
public class Resources {
    public static URL getResourceFile(String path){
        return StickyMemories.class.getResource(path);
    }
}
