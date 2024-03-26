Pour utiliser APACHE Hadoop en deployant des containers docker, il faut commencer par faire le clone de la structure basique.

```
git clone https://github.com/big-data-europe/docker-hadoop.git
```

Et pour deployer le .yml de docker, nous utilisons la commande:
```
docker-compose up -d
```

Pour regarder toutes les containers ouverts, nous pouvons regarder sur Docker Desktop ou nous pouvons utiliser:
```
docker ps {to see the process}
```

Donc la structure du system est le suivant et avec les commandes des connexion:

docker exec -it namenode ./bin/bash {to interact with the node}

hdfs dfs -mkdir /user/root/input

docker cp rousseauonline.txt namenode:/data    {Load data into the containers}
docker cp [OPTIONS] CONTAINER:SRC_PATH DEST_PATH|-


docker cp hadoop-mapreduce-examples-2.7.1-javadoc.jar namenode:/data

hdfs dfs -put rousseauonline.txt /user/root/input

mvn package
<!-- hadoop jar hadoop-mapreduce-examples-2.7.1-sources.jar org.apache.hadoop.examples.WordCount input output -->


hadoop jar hadoop_test-1.0-SNAPSHOT.jar org.apache.hadoop.examples.WordCount input output  


hadoop fs -cat output/part-r-00000

hdfs dfs -copyToLocal <hdfs_file_name> <local_path>

docker cp namenode:/data/ ../


