package com.eli.mygit.commands;

public class HelpCommand extends Command{
    @Override
    public void executeCommand() {
        System.out.println("usage: mygit [-v | --version] [-h | --help] [-C <path>] [-c <name>=<value>]\n" +
                "           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]\n" +
                "           [-p | --paginate | -P | --no-pager] [--no-replace-objects] [--bare]\n" +
                "           [--mygit-dir=<path>] [--work-tree=<path>] [--namespace=<name>]\n" +
                "           [--config-env=<name>=<envvar>] <command> [<args>]\n" +
                "\n" +
                "These are common mygit commands used in various situations:\n" +
                "\n" +
                "start a working area (see also: mygit help tutorial)\n" +
                "   clone     Clone a repository into a new directory\n" +
                "   init      Create an empty mygit repository or reinitialize an existing one\n" +
                "\n" +
                "work on the current change (see also: mygit help everyday)\n" +
                "   add       Add file contents to the index\n" +
                "   mv        Move or rename a file, a directory, or a symlink\n" +
                "   restore   Restore working tree files\n" +
                "   rm        Remove files from the working tree and from the index\n" +
                "\n" +
                "examine the history and state (see also: mygit help revisions)\n" +
                "   bisect    Use binary search to find the commit that introduced a bug\n" +
                "   diff      Show changes between commits, commit and working tree, etc\n" +
                "   grep      Print lines matching a pattern\n" +
                "   log       Show commit logs\n" +
                "   show      Show various types of objects\n" +
                "   status    Show the working tree status\n" +
                "\n" +
                "grow, mark and tweak your common history\n" +
                "   branch    List, create, or delete branches\n" +
                "   commit    Record changes to the repository\n" +
                "   merge     Join two or more development histories together\n" +
                "   rebase    Reapply commits on top of another base tip\n" +
                "   reset     Reset current HEAD to the specified state\n" +
                "   switch    Switch branches\n" +
                "   tag       Create, list, delete or verify a tag object signed with GPG\n" +
                "\n" +
                "collaborate (see also: mygit help workflows)\n" +
                "   fetch     Download objects and refs from another repository\n" +
                "   pull      Fetch from and integrate with another repository or a local branch\n" +
                "   push      Update remote refs along with associated objects\n" +
                "\n" +
                "'mygit help -a' and 'mygit help -g' list available subcommands and some\n" +
                "concept guides. See 'mygit help <command>' or 'mygit help <concept>'\n" +
                "to read about a specific subcommand or concept.\n" +
                "See 'mygit help mygit' for an overview of the system.");
    }
}
