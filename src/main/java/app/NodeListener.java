package app;

import com.generated.parser.EnglishBaseListener;
import com.generated.parser.EnglishParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class NodeListener extends EnglishBaseListener {
    int dependent_clauses = 0;
    int terminalCount = 0;
    String terminalWords = "";

    @Override
    public void visitTerminal(TerminalNode node) {
        terminalCount++;
        terminalWords += " " + node.getText();
    }

    @Override
    public void enterDependent_clause(EnglishParser.Dependent_clauseContext ctx) {
        dependent_clauses++;
    }

}
