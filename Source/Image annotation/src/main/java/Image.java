import clarifai2.api.ClarifaiBuilder;
import clarifai2.api.ClarifaiClient;

import okhttp3.OkHttpClient;


import java.io.IOException;

/**
 * Created by Gulnoza on 2/5/2017.
 */
public class Image
{
    public static void main (String[] args)throws IOException {
        final ClarifaiClient client = new ClarifaiBuilder("F9cC9V05cS0EatvI3vis1c2rVfS4oHhKexo1LODR", "IT2nK-L9NWELp6uIBx3_M_1wjYhDmm3V3PG_UlM_")
                .client(new OkHttpClient()) // OPTIONAL. Allows customization of OkHttp by the user
                .buildSync(); // or use .build() to get a Future<ClarifaiClient>
        client.getToken();

        KeyFrameDetection keyFrameDetection = new KeyFrameDetection();
        Annotation annotation = new Annotation();
        keyFrameDetection.Frames();
        keyFrameDetection.MainFrames();
        annotation.Annotation();

        }
    }

