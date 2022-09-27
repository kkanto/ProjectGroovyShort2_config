 
listView('ProjectGroovyShort2 Jobs') {
    description('ProjectGroovyShort2 Jobs')
    jobs {
        regex('ProjectGroovyShort2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
