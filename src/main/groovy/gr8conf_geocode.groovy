String BASE = 'https://maps.googleapis.com/maps/api/geocode/xml?'
String encoded = ['13A Mayur Vihar','Delhi','India'].collect {
    URLEncoder.encode(it,'UTF-8')
}.join(',')
String qs = "address=$encoded"
def root = new XmlSlurper().parse("$BASE$qs")
def loc = root.result[0].geometry.location
println "(${loc.lat},${loc.lng})"