package WzorProject;

public class Player {


    private boolean isLoad;

    public void play() {
        if (isLoad) {
            prepareAndPrintLog("wykonano PLAY");
        } else {
            prepareAndPrintLog("nie wykonano PLAY ponieważ isLoad jest fałszem");
        }
    }

    public void pause() {
        if (isLoad) {
            prepareAndPrintLog("wykonano PAUSE");
        } else {
            prepareAndPrintLog("nie wykonano PAUSE ponieważ isLoad jest fałszem");
        }
    }

    public void stop() {
        if (isLoad) {
            prepareAndPrintLog("wykonano STOP");
        } else {
            prepareAndPrintLog("nie wykonano STOP ponieważ isLoad jest fałszem");
        }
    }

    public void load() {
        isLoad = true;
        prepareAndPrintLog("Załadowano materiał");
    }

    public void reset() {
        isLoad = false;
        prepareAndPrintLog("Usunieto materiał z odtwarzacza");
    }

    private String prepareLog(String message) {
        return ConfigHelper.getInstance().getConfigValue("log.tag")
                + " " + message;
    }

    private void prepareAndPrintLog(String message) {
        System.out.println(prepareLog(message));
    }

}
