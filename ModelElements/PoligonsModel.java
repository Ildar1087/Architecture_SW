package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonsModel {
    public List<Poligon> poligons;
    public List<Texture> textures;

    public PoligonsModel(List<Texture> textures) {
        this.textures = textures;
        this.poligons = new ArrayList<>();
        this.poligons.add(new Poligon());


    }
}
