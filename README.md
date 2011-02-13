### Website for LispNYC.org

It's not perfect, contains Unix-isims and in some ways is suboptimal (see mail
handling), but works and is a growing work in progress.

### Requirements

In order to compile and run the project, either stand-alone or within
the Jetty webapp framework, it requires:

  * java
  * leiningen https://github.com/technomancy/leiningen
  * or maven
  * lispnyc-jetty project  https://github.com/heow/lispnyc-jetty
  * symlinks from this project into the lispnyc-jetty project
  
Symlinks are as such:

* homebase-data        -> your-jetty-install-directory/homebase-data
* pebbleblog-articles  -> your-jetty-install-directory/pebbleblog-articles
* html                 -> src/html

### Installation

    make-symlinks.sh
    lein deps
    ./start

Look at *http://localhost:8000*

### WAR Deployment

We're having trouble running the webapp as an actual war due to simplecms
and Clojure's compiled functions.  For now we expand it in the webapp directory 
of the lispnyc-jetty project.  This is done by the *build-deploy.sh* script.

    lein uberwar
    cp home.war your-jetty-install-directory/
    cd your-jetty-install-directory/webapps
    rm -rf home/
    mkdir home
    cd home
    jar -xf ../home.war 
    cd your-jetty-install-directory/
    ./start.sh 

