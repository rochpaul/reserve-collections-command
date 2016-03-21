package unidue.rcc;

import org.apache.cayenne.CayenneContext;
import org.apache.cayenne.DataChannel;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.event.DefaultEventManager;
import org.apache.cayenne.remote.ClientChannel;
import org.apache.cayenne.remote.ClientConnection;
import org.apache.cayenne.remote.hessian.HessianConnection;

/*
 * #%L
 * reserve-collections-command
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2014 - 2016 Universitaet Duisburg Essen
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ClientConnection connection = new HessianConnection("http://localhost:8080/library-uni-due-model/cayenne-service");
        DataChannel channel = new ClientChannel(connection, false, new DefaultEventManager(), false);
        ObjectContext context = new CayenneContext(channel);
        
        System.out.println( "Hello World!" );
    }
}





























//import java.io.IOException;
//
//import org.kohsuke.args4j.Argument;
//import org.kohsuke.args4j.CmdLineException;
//import org.kohsuke.args4j.CmdLineParser;
//import org.kohsuke.args4j.Option;
//import org.kohsuke.args4j.spi.SubCommand;
//import org.kohsuke.args4j.spi.SubCommandHandler;
//import org.kohsuke.args4j.spi.SubCommands;
//
//import unidue.reserve_collections_command.migration.DepartmentMigration;
//
///*
// * #%L
// * reserve-collections-command
// * $Id:$
// * $HeadURL:$
// * %%
// * Copyright (C) 2014 - 2016 Universitaet Duisburg Essen
// * %%
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// * 
// *      http://www.apache.org/licenses/LICENSE-2.0
// * 
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// * #L%
// */
//
///**
// * Sample program from args4j site (modified)
// * @author
// *      Kohsuke Kawaguchi (kk@kohsuke.org)
// */
//public class App {
//    // needed by all subcommands
////    Session somesession;
//
//    @Option(name="-u",usage="user")
//    private String user = "notsetyet";
//
//    @Option(name="-p",usage="passwd")
//    private String passwd = "notsetyet";
//
//    @Argument(required=true,index=0,metaVar="action",usage="subcommands, e.g., {search|modify|delete}",handler=SubCommandHandler.class)
//    @SubCommands({
//      @SubCommand(name="search",impl=DepartmentMigration.class),
//    })
//    protected String action;
//
//    public static void main(String[] args) throws IOException {
//        new App().doMain(args);
//    }
//
//    public void doMain(String[] args) throws IOException {
//        CmdLineParser parser = new CmdLineParser(this);
//        
//        // if you have a wider console, you could increase the value;
//        // here 80 is also the default
//        parser.setUsageWidth(80);
//
//        try {
//            // parse the arguments.
//            parser.parseArgument(args);
//
//            // you can parse additional arguments if you want.
//            // parser.parseArgument("more","args");
//
//            // after parsing arguments, you should check
//            // if enough arguments are given.
//            if( arguments.isEmpty() )
//                throw new CmdLineException(parser,"No argument is given");
//
//        } catch( CmdLineException e ) {
//            // if there's a problem in the command line,
//            // you'll get this exception. this will report
//            // an error message.
//            System.err.println(e.getMessage());
//            System.err.println("java SampleMain [options...] arguments...");
//            // print the list of available options
//            parser.printUsage(System.err);
//            System.err.println();
//
//            // print option sample. This is useful some time
//            System.err.println("  Example: java SampleMain"+parser.printExample(ALL));
//
//            return;
//        }
//}
