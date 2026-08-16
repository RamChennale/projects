# projects

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Aug 2026 Prepared commands
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Git Cheat Sheet — Daily Use & Interview Prep

## 1. Setup & Info
```bash
git init                        # initialize a new repo
git clone <url>                 # clone a remote repo
git status                      # check current state
git log --oneline --graph --all # visual commit history
git diff                        # unstaged changes
git diff --staged               # staged changes
```

## 2. Basic Daily Workflow
```bash
git add <file>          # stage a file (or . / -A for all)
git commit -m "msg"     # commit staged changes
git commit --amend      # edit last commit (msg or content)
git push                # push to remote
git pull                # fetch + merge from remote
git fetch                # download changes, don't merge
```

## 3. Branching
```bash
git branch                  # list branches
git branch <name>           # create branch
git checkout <branch>       # switch branch (older)
git switch <branch>         # switch branch (newer)
git checkout -b <branch>    # create + switch
git merge <branch>          # merge branch into current
git branch -d <branch>      # delete branch (safe)
git branch -D <branch>      # force delete branch
```

## 4. Undoing Things
```bash
git stash                   # save uncommitted work
git stash pop                # reapply + remove from stash
git stash list                # list all stashes
git stash apply stash@{2}    # apply specific stash
git stash drop                # delete a stash

git reset --soft HEAD~1      # undo commit, keep staged
git reset --mixed HEAD~1     # undo commit, keep unstaged (default)
git reset --hard HEAD~1      # undo commit, discard changes

git revert <commit>          # safe undo via new commit
git checkout -- <file>       # discard local changes (old)
git restore <file>           # discard local changes (new)
git rm --cached <file>       # untrack file, keep it locally
```

## 5. Remote Work
```bash
git remote -v                     # list remotes
git remote add origin <url>       # add remote
git push -u origin <branch>       # push + set upstream
git pull --rebase                 # pull with rebase instead of merge

git remote add upstream <url>     # for fork workflows
git fetch upstream
git rebase upstream/main
```

## 6. Interview-Favorite Commands

| Command | Purpose |
|---|---|
| `git rebase -i HEAD~3` | Interactive rebase — squash/reword/drop commits |
| `git cherry-pick <commit>` | Apply one specific commit onto current branch |
| `git bisect` | Binary search commits to find a bug-introducing commit |
| `git blame <file>` | See who changed each line and when |
| `git reflog` | Recover lost commits/branches (even unreachable ones) |
| `git tag v1.0.0` | Create a version tag |
| `git reset` vs `git revert` | reset rewrites history; revert adds a new undo commit (safe for shared branches) |

## Interview-favorite commands & concepts

These come up because they test whether you actually *understand* git internals, not just memorized commands.

**1. `git rebase` vs `git merge`**
Know the difference cold — merge preserves history with a merge commit; rebase rewrites commit history to create a linear log. Be ready to explain interactive rebase:
```
git rebase -i HEAD~3
```
(squash, reword, drop commits)

**2. `git reset` vs `git revert`**
- `reset` rewrites history (dangerous on shared branches)
- `revert` creates a new commit undoing changes (safe for shared branches)
- Know `--soft`, `--mixed`, `--hard` differences

**3. `git cherry-pick <commit>`**
Apply a specific commit from one branch to another — common scenario: "how do you move just one fix to another branch?"

**4. `git stash` variants**
```
git stash save "message"
git stash list
git stash apply stash@{2}
git stash drop
```

**5. Merge conflicts**
Be ready to actually resolve one live: explain `<<<<<<<`, `=======`, `>>>>>>>` markers, then:
```
git add <resolved-file>
git commit
```

**6. `git blame` / `git bisect`**
- `blame` — who changed a line and when
- `bisect` — binary search through commits to find a bug-introducing commit (interviewers love this one, it's often unknown to junior devs)

**7. `.gitignore` and `git rm --cached`**
Removing a tracked file from git without deleting it locally — common "oops I committed node_modules" scenario.

**8. `git reflog`**
"How do you recover a deleted branch or lost commit?" — reflog is the answer, shows even unreachable commits.

**9. `git tag`**
```
git tag v1.0.0
git push origin v1.0.0
```

**10. Fork/PR workflow concepts**
Understand upstream vs origin:
```
git remote add upstream <url>
git fetch upstream
git rebase upstream/main
```


### Resolving a merge conflict
```bash
# after conflict markers appear:
# <<<<<<< HEAD
# your changes
# =======
# their changes
# >>>>>>> branch-name

# manually edit the file, then:
git add <resolved-file>
git commit
```

## 7. Key Interview Concepts to Explain Verbally
- `git fetch` vs `git pull` — fetch downloads only; pull = fetch + merge
- What the staging area (index) is and why it exists
- How git stores data internally: blobs, trees, commits, SHA-1 hashing
- `merge` vs `rebase` — history shape, when to use which
- `reset --soft/--mixed/--hard` — what each keeps or discards
- Detached HEAD state — what it is, how to get out of it
- Squashing commits before opening a PR
- `git branch -d` vs `-D` — safe vs forced delete
- Fork/PR workflow: origin vs upstream

## 8. Quick Scenario Answers
- **"Oops, committed node_modules"** → `git rm --cached -r node_modules` + add to `.gitignore`
- **"Need to move one fix to another branch"** → `git cherry-pick <commit>`
- **"Accidentally deleted a branch"** → `git reflog` → find commit → `git checkout -b <branch> <sha>`
- **"Need to find which commit broke something"** → `git bisect start` → `git bisect bad` / `git bisect good <sha>`
- **"Need to clean up messy commit history before PR"** → `git rebase -i HEAD~N`


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
OLD PREPARED commands 
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Here are the Git commands which are being covered: NOTE: [variable name] == origin

git config git init git clone git add git commit git diff git reset git status git rm git log git show git tag git branch git checkout 
git merge git remote git push git pull git stash So, let's get started!

Git Commands

git config
Usage: git config --global user.name “[name]”
Usage: git config --global user.email “[email address]”
This command sets the author name and email address respectively to be used with your commits.

git init
Usage: git init [repository name] This command is used to start a new repository.

git clone
Usage: git clone [url]
This command is used to obtain a repository from an existing URL.

git add
Usage: git add [file]
This command adds a file to the staging area.

git add *
Usage: git add *
This command adds one or more to the staging area.

git commit
Usage: git commit -m “[ Type in the commit message]”
This command records or snapshots the file permanently in the version history.

git commit -a
Usage: git commit -a
This command commits any files you’ve added with the git add command and also commits any files you’ve changed since then.

git diff
Usage: git diff
This command shows the file differences which are not yet staged.

9.git diff –staged

Usage: git diff –staged This command shows the differences between the files in the staging area and the latest version present.

git diff [first branch] [second branch]
Usage: git diff [first branch] [second branch]
This command shows the differences between the two branches mentioned.

git reset
Usage: git reset [file]
This command unstages the file, but it preserves the file contents.

Usage: git reset [commit]
This command undoes all the commits after the specified commit and preserves the changes locally.

Usage: git reset –hard [commit]
This command discards all history and goes back to the specified commit.

git status

Usage: git status
This command lists all the files that have to be committed.

git rm
Usage: git rm [file]
This command deletes the file from your working directory and stages the deletion.

git log
Usage: git log
This command is used to list the version history for the current branch.

Usage: git log –follow[file]
This command lists version history for a file, including the renaming of files also.

git show
Usage: git show [commit]
This command shows the metadata and content changes of the specified commit.

git tag
Usage: git tag [commitID]
This command is used to give tags to the specified commit.

git branch
Usage: git branch
This command lists all the local branches in the current repository.

Usage: git branch [branch name]
This command creates a new branch.

Usage: git branch -d [branch name]
This command deletes the feature branch.

git checkout
Usage: git checkout [branch name]
This command is used to switch from one branch to another.

Usage: git checkout -b [branch name]
This command creates a new branch and also switches to it.

git merge
Usage: git merge [branch name]
This command merges the specified branch’s history into the current branch.

git remote
Usage: git remote add origin [Remote Server Link]
Usage: git remote add [variable name] [Remote Server Link]
This command is used to connect your local repository to the remote server.

git push
Usage: git push [variable name] master
This command sends the committed changes of master branch to your remote repository.

Usage: git push [variable name] [branch]
This command sends the branch commits to your remote repository.

Usage: git push –all [variable name]
This command pushes all branches to your remote repository.

Usage: git push [variable name] :[branch name]
This command deletes a branch on your remote repository.

git pull
Usage: git pull [Repository Link]
This command fetches and merges changes on the remote server to your working directory.

git stash
Usage: git stash save
This command temporarily stores all the modified tracked files.

Usage: git stash pop
This command restores the most recently stashed files.

Usage: git stash list
This command lists all stashed changesets.

Usage: git stash drop
This command discards the most recently stashed changeset.
