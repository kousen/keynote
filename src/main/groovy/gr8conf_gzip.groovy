import java.util.zip.*

println new GZIPInputStream('http://gr8conf.in'.toURL()
                                       .newInputStream()).text
