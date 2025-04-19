public class CommandParser {

    public void commandHandler(String[] args){
        String command;
        if(args.length > 0)
            command = args[0];
        else
            command = "help";

        switch (command){
            case "help":
                break;
            case "status":
                break;
            case "show":
                break;
            case "log":
                break;
            case "diff":
                break;
            case "init":
                break;
            case "add":
                break;
            case "commit":
                break;
            case "branch":
                break;
            case "checkout":
                break;
            case "switch":
                break;
            case "merge":
                break;
            case "rebase":
                break;
            case "stash": //add a case for stash pop
                break;
            case "restore":
                break;
            case "reset":
                break;
            case "clean":
                break;
            default:
                System.out.println("git: " + command + "is not a git command. See 'git --help");
        }

        System.out.println(command);
    }
}
