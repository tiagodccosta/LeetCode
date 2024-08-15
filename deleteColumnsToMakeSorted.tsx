function minDeletionSize(strs: string[]): number {
    let del = 0; 

    if (strs.length === 0) return del;

        for (let col = 0; col < strs[0].length; col++) {
            for (let row = 0; row < strs.length - 1; row++) {
                if (col >= strs[row].length || col >= strs[row + 1].length) continue;
                if (strs[row].charAt(col) > strs[row + 1].charAt(col)) {
                    del++;
                    break;
                }
            }
        }

        return del;
};