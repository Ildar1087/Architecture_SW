package InMemoryModel;


import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonsModel;
import ModelElements.Scene;
import ModelElements.Texture;

public class ModelStore implements IModelChanger {
    public List<PoligonsModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangeObserver[] changeObservers;

    public ModelStore(IModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        List<Texture> textures = new ArrayList<>();
        this.models.add(new PoligonsModel(textures));
        this.flashes.add(new Flash());
        this.cameras.add(new Camera());
        this.scenes.add(new Scene(0, models, flashes, cameras));
    }

    public Scene getScene(int id) {
        return this.scenes.get(id);
    }

    @Override
    public void notifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyChange'");
    }


}