/*
 	(c) Copyright 2005, 2006, 2007, 2008, 2009 Hewlett-Packard Development Company, LP
 	All rights reserved - see end of file.
 	$Id: RuleSet.java,v 1.7 2009-01-13 14:05:58 chris-dollin Exp $
*/

package com.hp.hpl.jena.assembler;

import java.util.*;

import com.hp.hpl.jena.reasoner.rulesys.Rule;

/**
    A RuleSet wraps a list of rules.
    
    @author kers
 */
public class RuleSet
    {
    public static final RuleSet empty = create( Collections.EMPTY_LIST );
    
    public static RuleSet create( List rules )
        { return new RuleSet( rules ); }

    public static RuleSet create( String ruleString )
        { return create( Rule.parseRules( ruleString ) ); }
    
    private final List rules;
    
    protected RuleSet( List rules )
        { this.rules = new ArrayList( rules ); }

    public List getRules()
        { return rules; }
    
    public int hashCode()
        { return rules.hashCode(); }
    
    public boolean equals( Object other )
        { return other instanceof RuleSet && rules.equals( ((RuleSet) other).rules ); }

    }


/*
 * (c) Copyright 2005, 2006, 2007, 2008, 2009 Hewlett-Packard Development Company, LP
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/