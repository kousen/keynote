import groovy.json.*
String BASE = 'http://api.icndb.com/jokes/random?'
String qs = [limitTo:'[nerdy]',firstName:'Burt',lastName:'Beckwith']
    .collect { k,v -> "$k=$v" }.join('&')
def json = new JsonSlurper().parse("$BASE$qs".toURL())
println json.value.joke