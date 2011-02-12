### Website for LispNYC.org

It's not perfect, contains Unix-isims and in some ways is suboptimal (see mail
handling), but works and is a growing work in progress.

### Requirements

In order to compile and run the project, either stand-alone or within
the Jetty webapp framework, it requires:

  * lispnyc-jetty project
  * symlinks from this project into the lispnyc-jetty project
  
Symlinks are as such:

* homebase-data        -> your-jetty-install-directory/homebase-data
* pebbleblog-articles  -> your-jetty-install-directory/pebbleblog-articles
* html                 -> src/html

### Installation

Run the *make-symlinks.sh* file to symlink between this and Jetty, only once.

Run 
    lein deps
and
    ./start
or
    ./build-deploy.sh

Start runs the lispnyc website as a local Jetty

Hit *http://localhost:8000*

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

