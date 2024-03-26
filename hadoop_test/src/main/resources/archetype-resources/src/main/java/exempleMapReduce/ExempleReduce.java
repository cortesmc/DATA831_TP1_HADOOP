package ocr.dataArchitect.cours1.hadoop.exempleMapReduce;

import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.io.*
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;
import jave.io.Iterable;

// A compléter selon le problème
public class ExempleReduce extends Reducer<TypeCleI,TypeValI,TypeCleS,TypeValS> {
    // Écriture de la fonction reduce
    @Override
    protected void reduce(TypeCleI cleI, Iterable<TypeValI> listevalI, Context context) throws IOException,InterruptedException
    {
        // À compléter selon le probleme
        TypeCleS cleS = new TypeCleS(...);
        TypeValS valS = new TypeValS(...);
        for (TypeValI val: listevalI) {
            // traitement cleS.set(...), valS.set(...)
        }
        context.write(cleS,valS);
    }
}